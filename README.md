# gcp-hello-world-ms
A simple spring boot example with a rest endpoint that returns "Hello, World!"

### Build and run the application

```bash
# build
mvn clean install

# run
mvn spring-boot:run
```

### Hit the endpoint
http://localhost:8080/hello-world

```text
> curl http://localhost:8080/hello-world
Hello, World!
```

