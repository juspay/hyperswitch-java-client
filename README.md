# java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>com.hyperswitch</groupId>
    <artifactId>hyperswitch-java</artifactId>
    <version>1.0.0</version>
</dependency>

```

And to use the api you can follow the examples bellow:

```java
{
    //Set bearer token manually
    HsApiClient HsApiClient = new HsApiClient("petstore_auth_client");
    HsApiClient.setBasePath("https://localhost:8243/petstore/1/");
    HsApiClient.setAccessToken("TOKEN", 10000);

    //Use api key
    HsApiClient HsApiClient = new HsApiClient("api_key", "API KEY");
    HsApiClient.setBasePath("https://localhost:8243/petstore/1/");

    //Use http basic authentication
    HsApiClient HsApiClient = new HsApiClient("basicAuth");
    HsApiClient.setBasePath("https://localhost:8243/petstore/1/");
    HsApiClient.setCredentials("username", "password");

    //Oauth password
    HsApiClient HsApiClient = new HsApiClient("oauth_password");
    HsApiClient.setBasePath("https://localhost:8243/petstore/1/");
    HsApiClient.setOauthPassword("username", "password", "client_id", "client_secret");

    //Oauth client credentials flow
    HsApiClient HsApiClient = new HsApiClient("oauth_client_credentials");
    HsApiClient.setBasePath("https://localhost:8243/petstore/1/");
    HsApiClient.setClientCredentials("client_id", "client_secret");

    PetApi petApi = HsApiClient.buildClient(PetApi.class);
    Pet petById = petApi.getPetById(12345L);

    System.out.println(petById);
  }
```

## Recommendation

It's recommended to create an instance of `HsApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hyperswitch@juspay.in

