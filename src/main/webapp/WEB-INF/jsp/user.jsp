<%--
  Created by IntelliJ IDEA.
  User: JJR
  Date: 2019/6/22 0022
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>user</title>
    <script src="../js/jquery.min.js"></script>
</head>
<body onload="x()">
<h1>${user.username }</h1>
<br />
<%-- 显示所有的admin 的blog --%>
<div class="blog">

</div>
<br />
<a href="/user/logout">注销</a>
</body>
<script type="application/javascript">
    function x() {
        var userid = '${user.id }'
        $.ajax({
            url:"/blog/get",    //请求的url地址
            dataType:"json",   //返回格式为json
            async:true,//请求是否异步，默认为异步，这也是ajax重要特性
            data:{},    //参数值
            type:"GET",   //请求方式
            beforeSend:function(){
                //请求前的处理
            },
            success:function(req){
                //请求成功时处理

                console.log(req)
                df = document.querySelector("body > div");
                for (var i=0;i<= req.blog.length;i++){
                    var oDiv = document.createElement("div");
                    oDiv.innerHTML = "<div style='font-size: 30px'>" + (req.blog)[i].mainBlog.title + "</div>" +
                        "<div>" + (req.blog)[i].mainBlog.text + "</div>"+
                        "</div>"+
                        "<form action='/blog/add' method='post'>" +
                        "<input type='hidden' name='blogid' value='"+(req.blog)[i].mainBlog.id+"' >" +
                        "<input type='hidden' name='userid' value='"+userid+"' >" +
                        "<input name='text' type='text'>" +
                        "<input type='submit' value='回复'> " +
                        "</form> "+
                        "</div>";

                    df.appendChild(oDiv);
                    for(var j = 0; j<(((req.blog)[i]).hf).length; j++){
                        var hf = document.createElement("div");
                        hf.innerHTML = "<div>"+((req.blog)[i].hf)[j].text+"</div>"
                        df.appendChild(hf);
                    }
                    var br = document.createElement("div");
                    br.innerHTML = "<br />";
                    df.appendChild(br);

                }
                document.body.appendChild(df);
            },
            complete:function(){
                //请求完成的处理
            },
            error:function(){
                //请求出错处理
            }
        });
    }
</script>
</html>
