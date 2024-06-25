<template>
    <div id='app'>
        <div v-if="member" class="d-flex flex-column">
            <!-- user profile -->
            <div id="user-profile" class="mb-3">
                <!-- 사진 -->
                <ProfileImage :img-size="imgSize" :img-src="member.profileImg" />

                <!-- 회원 정보 -->
                <div class="user-info d-flex flex-column" style="margin-left: 10px;">
                    <!-- 팔로우 정보 테이블 -->
                    <table class="follow-table">
                        <tr>
                            <td colspan=3 id="nickname">{{ member.nickname }}</td>
                        </tr>
                        <tr>
                            <td @click="showFollowingDetail"><b>팔로잉</b></td>
                            <td @click="showFollowerDetail"><b>팔로워</b></td>
                        </tr>
                        <tr>
                            <td @click="showFollowingDetail">{{ followingCount }}</td>
                            <td @click="showFollowerDetail">{{ followerCount }}</td>
                        </tr>
                    </table>
                    <div class="d-flex justify-content-center">
                        <RouterLink class="nav" :to="{ name: 'update' }" v-if="memberNo === loginNo">프로필 수정</RouterLink>
                        <div v-if="followStore.isFollowing !== null">
                            <button class="nav" v-if="memberNo !== loginNo && followStore.isFollowing === true"
                                @click="deleteFollow(memberNo)">언팔로우</button>
                            <button class="nav" v-if="memberNo !== loginNo && followStore.isFollowing === false"
                                @click="addFollow(memberNo)">팔로우</button>
                        </div>
                    </div>
                </div> <!-- end of user-info  -->
            </div><!-- end of user-profile -->
            <div v-show="memberNo === loginNo && isDefaultRoute && recommend_list.length !== 0"
                class="alert alert-light alert-dismissible fade show recommend-wrap" role="alert">
                <div>
                    <p style="font-weight: bold; font-size: 17px;">🏋️ 비슷한 운동을 즐겨한 유저🏋️</p>
                    <b style="font-size: 18px;"></b>
                    <div class="d-flex flex-row">
                        <div v-for="recommend in recommend_list" :key="recommend.no" class="recommend-div"
                            style="margin-right: 10px;">
                            <div @click="changePage(recommend.no)">
                                <ProfileImage :img-src="recommend.profileImg"
                                    :img-size="{ width: '80px', height: '80px' }">
                                </ProfileImage>
                                <p>{{ recommend.nickname }}</p>
                            </div>
                        </div>
                    </div>
                </div>
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>

            <RouterView :member="member"></RouterView>

            <FollowDetail v-if="isFollowVisible" @close-modal="closeFollow"></FollowDetail>
        </div>
    </div><!--end of app-->
</template>

<script setup>
import ProfileImage from '@/components/member/ProfileImage.vue';
import { onMounted, ref, watch, computed, onUpdated } from 'vue';
import api from '@/api';
import FollowDetail from '@/components/follow/followDetail.vue';
import { useMemberStore } from '@/stores/member';
import { useRoute, useRouter } from 'vue-router'
import { HttpStatusCode } from 'axios';
import VideoList from '@/components/member/VideoList.vue';
import { useFollowStore } from '@/stores/follow';

const route = useRoute()
const router = useRouter()
const memberStore = useMemberStore()

const isDefaultRoute = computed(() => {
    return route.path === `/member/${memberNo.value}`
})

// member
const loginNo = ref(sessionStorage.getItem('no'))
const member = ref(null)
const memberNo = ref(null)
const imgSize = {
    width: '130px',
    height: '130px',
    'margin-right': '10px'
}


// follow
const isFollowVisible = ref(false)
const followStore = useFollowStore()

const showFollowerDetail = () => {
    isFollowVisible.value = true;
    followStore.chooseFollower()
}

const showFollowingDetail = () => {
    isFollowVisible.value = true;
    followStore.chooseFollowing()
}

const closeFollow = (memberNo) => {
    if (memberNo != null) {
        router.push("/member/" + memberNo).then(() => {
            window.location.reload();
        });
    }
    isFollowVisible.value = false;
}

const deleteFollow = (no) => {
    followStore.type = ''
    followStore.deleteFollow(no)
    fetchData(no)
}

const addFollow = (no) => {
    followStore.addFollow(no)
    fetchData(no)
}

// watch
watch(() => route.params.no, (newNo) => {
    fetchData(newNo)
    memberNo.value = route.params.no
    if (newNo == loginNo) getRecommendMember()
})

watch(route.fullPath, () => {
    router.go(route.path)
})

// onMounted
onMounted(() => {
    memberNo.value = route.params.no
    fetchData(memberNo.value)
    if (memberNo.value == loginNo.value) getRecommendMember()
})

const fetchData = (no) => {
    api({
        url: 'http://localhost:8080/member',
        method: 'POST',
        data: {
            key: 'no',
            value: no,
        }
    }).then((res) => {
        if (res.status == HttpStatusCode.NoContent) {
            alert('회원을 찾을 수 없습니다.')
            return
        }
        member.value = res.data
        followStore.getFollower(no)
        followStore.getFollowing(no)
        followStore.checkFollow(no)
        console.log("check = ", followStore)
    }).catch((err) => console.log(err))

}

const changePage = (no) => {
    window.location.href = `/member/${no}`
}

const recommend_list = ref([])

const getRecommendMember = function () {
    api({
        url: `http://localhost:8080/member/recommend?memberNo=${sessionStorage.getItem('no')}`,
    }).then((res) => {
        recommend_list.value = res.data
    }).catch((err) => console.log(err))
}

// Computed Properties for following and follower counts
const followingCount = computed(() => followStore.followingList.length)
const followerCount = computed(() => followStore.followerList.length)

</script>

<style scoped>
#app {
    margin-top: 80px;
    height: 660px;
    overflow: scroll;
}

#user-profile {
    display: flex;
    align-items: center;
    vertical-align: center;
    margin: 0 auto;
}

#nickname {
    text-align: center;
    font-size: 23px;
    letter-spacing: 0.2rem;
}

.follow-table {
    border: none;
    text-align: center;
}

.follow-table td {
    padding: 5px 10px;
}

.follow-table b {
    font-size: 17px;
}

.active {
    background-color: aliceblue;
}

.recommend-div {
    text-align: center;
    justify-content: center;
    width: 100px;
    border: none;
    border-radius: 10px;
    background-color: rgb(227, 227, 227);
    padding-left: 8px;
    padding-top: 10px;
}

.recommend-div:hover {
    background-color: rgb(242, 242, 242);
}

.recommend-wrap {
    display: flex;
    flex-wrap: nowrap;
    overflow-x: scroll;
    -webkit-overflow-scrolling: touch;
    padding: 20px;
    overflow-x: scroll;
}

.recommend-wrap::-webkit-scrollbar {
    height: 3px;
}

.recommend-wrap::-webkit-scrollbar-thumb {
    background-color: #2f3542;
    border-radius: 10px;
}

.recommend-wrap::-webkit-scrollbar-track {
    background-color: grey;
    border-radius: 10px;
    box-shadow: inset 0px 0px 3px white;
}


.nav {
    text-decoration: none;
    border-radius: 15px;
    background-color: rgb(170, 205, 248);
    border: none;
    color: white;
    padding: 10px;
}

.nav:hover {
    background-color: rgb(148, 194, 249);
    border: none;
}
</style>
