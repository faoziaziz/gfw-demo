# Mantap
ini baru mantap

## Anjrit

```bash
curl -X POST https://gfw-demo.herokuapp.com/gfw-data -H 'Content-type:application/json' -d '{"name": "mantap"}'

curl -X POST http://localhost:8083/add -H 'Content-type:application/json' -d '{"id":"1232", "name": "Aziz", "salary": 1200}'

curl -X POST http://localhost:8083/add -H 'Content-type:application/json' -d '{"id":"12122", "name": "Aziz", "salary": 1200}'

curl -X POST http://localhost:8083/add -H 'Content-type:application/json' -d '{"id":"3", "name": "Kma", "salary": 120112}'

curl -X POST http://localhost:8083/api-gfw/v1/add -H 'Content-type:application/json' -d '{"id":"4", "device": "dev112", "longitude": 123.321, "latitude": 321.12, "DateStamp": "kontol"}'

curl -X POST http://localhost:8080/api-gfw/v1/add -H 'Content-type:application/json' -d '{"id":"bokerdinerak4", "device": "dev112", "longitude": 123.321, "latitude": 321.12, "DateStamp": "kontol"}'

curl -X POST http://localhost:8083/api-gfw/v1/add -H 'Content-type:application/json' -d '{"id":"4", "name": "Kma", "salary": "1239"}'

curl -X POST http://ec2-52-221-222-103.ap-southeast-1.compute.amazonaws.com:8080/add -H 'Content-type:application/json' -d '{"id":"3", "name": "Kma", "salary": 120112}'

```

## other json tester 

```sh
curl -X POST http://server.faozi.tech:8083/api-gfw/v1/add -H 'Content-type:application/json' -d '{ "id":"bokerdinerak4", "device": "dev112", "DateStamp": "cerol", "online": 123.1231, "status": 123.231, "satelite_used": 4212.431, "mode": 123.021, "time": 123.021, "longitude": 123.321, "latitude": 321.12, "altitude": 32.12, "speed": 42.12, "track": 12.32, "pdop": 21.12 }'
```
## Referensi
1. [Spring Tutorial ](https://spring.io/guides/tutorials/bookmarks/)
2. [Redis dan Spring](https://medium.com/@kumarshivam_66534/implementation-of-spring-boot-data-redis-for-caching-in-my-application-218d02c31191)