# City Api

## Running steps

### Build
```
./mvnw clean package 
```

### Run
```
./mvnw spring-boot:run 
```

### Run Container
```
docker run --rm -p 8080:8080 lprone/cityapi
```

### Test Api
```
curl http://localhost:8080/cities | json_pp
```

```
curl http://localhost:8080/city?name=Rosario | json_pp
```# cities-api
