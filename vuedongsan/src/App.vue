<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <div>
    <h4>에어팟 프로</h4>
    <p>{{price1}}만원</p>
  </div>
  <div>
    <h4>아이폰 12</h4>
    <p>{{price2}} 만원</p>
  </div>
  
</template>
<!-- template안에는 html -->


<!-- 스크립트  ------------------------------------------------>
<script>

    

export default {
  name: 'App',
  // 데이터 저장함   object자료로,, 자료이름:자료내용
  //  data바인딩 하는이유 1.html에 하드코딩해두면 나중 변경 힘들어 
  // 2.실시간 자동 렌더링 쓰려고
  // {{}} 이거써야 가능

data(){      
  return{
    price1 : 30  , 
    price2 : 90

  }
},

  components: {
   
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
