<template>
    <div id="app">
        <!-- user profile -->
        <div id="user-profile">
            <!-- 사진 -->
            <ProfileImage :img-size="imgSize" />
            <!-- 회원 정보 -->
            <div class="user-info">
                <div id="nickname">
                    <b>권서현</b>
                </div>
                <!-- 팔로우 정보 테이블 -->
                <table class="follow-table">
                    <tr>
                        <td><b>팔로잉</b></td>
                        <td><b>팔로워</b></td>
                    </tr>
                    <tr>
                        <td>100</td>
                        <td>200</td>
                    </tr>
                </table>
            </div> <!-- end of user-info  -->
        </div><!-- end of user-profile -->

        <div class="videos-div">
            <ul class="nav nav-pills">
                <li class="nav-item">
                    <RouterLink to="/mypage" class="nav-link active" aria-current="page" href="#">나의 영상</RouterLink>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">좋아요 한 영상</a>
                </li>
            </ul>
            <RouterView></RouterView>
        </div>
    </div> <!--end of app-->
</template>

<script setup>
import ProfileImage from '@/components/member/ProfileImage.vue';

const imgSize = {
    width: '110px',
    height: '110px',
    'margin-right': '10px'
}
</script>

<style scoped>
#user-profile {
    display: flex;
    align-items: center;
    vertical-align: center;
    margin-top: 100px;
    margin-left: 20px;
    margin-right: 20px;
}

#nickname {
    font-size: 23px;
    margin-left: 33px;
    margin-top: 10px;
    margin-bottom: 5px;
    letter-spacing: 0.2rem;
}

.videos-div {
    margin-top: 50px;
    display: flex;
    flex-direction: column;
    justify-content: center; 
}

.follow-table {
    margin-left: 30px;
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
</style>