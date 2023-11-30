# VirtualThread-SpringBoot

I tested the virtual threads introduced with Java 21 in this project. I conducted tests with 10,000 users using Apache Benchmark on my own computer. Below are the results.

![image](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/8ce30115-783e-4677-ae81-8481f897957d)

## Test
ab -c 10000 -n 10000 http://localhost:8080/virtual/thread/delay/service?second=3

## Virtual Thread Not Enabled

![Screenshot_5](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/8178549a-abe2-4739-bbb8-0766e4d4f94b)

![Screenshot_6](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/12570a7f-5111-4351-ac75-eb05ee88ee24)

Because it doesn't have an available thread to give me, I cannot access the URL at the moment. It is keeping me waiting.

![Screenshot_4](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/0366d6f4-4830-421a-aca6-a5769f1eb488)
### JConsole

You can open JConsole as follows:


![image](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/9633369c-05e6-4bc9-a2c3-e3d36949ae47)

![image](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/dcd4db8a-1f07-4842-87cb-a228e8be8c28)


## Virtual Thread Enabled
![Screenshot_7](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/54bd08b9-d6b0-4a58-9a72-98cda7681e15)

![Screenshot_8](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/7c6d88c6-bbef-4d7a-a84d-478fc4f9ae72)
![Screenshot_10](https://github.com/erayaraz/VirtualThread-SpringBoot/assets/47903345/48706aef-736d-4308-aad1-2ac11d603174)
