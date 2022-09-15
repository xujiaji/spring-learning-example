参照：
https://github.com/xkcoding/spring-boot-demo/tree/master/demo-mq-rabbitmq


1. 下载镜像：`docker pull rabbitmq:3.9.20-management`

2. 运行容器：`docker run -d -p 5671:5617 -p 5672:5672 -p 4369:4369 -p 15671:15671 -p 15672:15672 -p 25672:25672 --name rabbit-3.9.20 rabbitmq:3.9.20-management`

3. 进入容器：`docker exec -it rabbit-3.9.20 /bin/bash`

4. 给容器安装 下载工具 wget：`apt-get install -y wget`，（安装失败可以先执行`apt-get update`）

5. 下载插件包`rabbitmq_delayed_message_exchange` https://www.rabbitmq.com/community-plugins.html ，因为我们的 `RabbitMQ` 版本为 `3.9.20` 所以我们安装 `3.9.0` 版本的延迟队列插件

6. wget 下载对应的包，放到 `/plugins`

7. 启动延迟队列 `rabbitmq-plugins enable rabbitmq_delayed_message_exchange`

8. `exit`退出容器，重启rabbitmq `docker restart rabbit-3.9.20`
