<template>
    <div class="comment-modal">
        <div class="modal-content">
            <h2>댓글</h2>
            <span class="close" @click="$emit('closeModal')">&times;</span>
            <div class="comments">
                <div class="comment">
                    <p>사용자1: 좋은 영상입니다!</p>
                </div>
                <div class="comment">
                    <p>사용자2: 잘 보고 갑니다!</p>
                </div>
                <!-- Add more comments as needed -->
            </div>
        </div>
    </div>
</template>


<script setup>
</script>

<style scoped>
.comment-modal {
  position: fixed;
  z-index: 1000;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  overflow: auto;
  background-color: rgba(0, 0, 0, 0.4);
}

.modal-content {
  background-color: #fefefe;
  margin: 15% auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
  max-width: 600px;
  top: 20%;
}

.close {
  color: #aaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: black;
  text-decoration: none;
  cursor: pointer;
}

.comments {
  margin-top: 20px;
}

.comment {
  border-bottom: 1px solid #ddd;
  padding: 10px 0;
}

.comment p {
  margin: 5px 0;
}
</style>