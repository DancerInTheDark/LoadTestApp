# Getting Started

### Step-by-step instruction:

For further reference, please consider the following sections:

1. Clone repository - `git clone https://github.com/DancerInTheDark/LoadTestApp.git`
2. Run `cd LoadTestApp`
3. Run `./gradlew clean build`
4. Run `docker-compose build`
5. Run `docker-compose up`
6. Update urls.txt file and set your ip address in url
7. Run siege `docker run --rm -t yokogawa/siege -t15s -c10 -f urls.txt`
