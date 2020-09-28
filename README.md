<h1>Google Pub/Sub and Spring Boot</h1>
<h2>Google Cloud Platform Pre-requisites</h2>
<ol>
    <li>Pub/Sub -> Topic -> Create topic: "testTopic".</li>
    <li>Pub/Sub -> Subscriptions -> Create subscriptions: "testSubscription" using topic "testTopic".</li>
    <li>APIs & Services -> Credentials -> Create Credentials -> Service Account -> "test-service-account" with role 'Owner'.</li>
    <li>Select the creation service account -> Add Key -> Create Key -> Json.</li>
    <li>Copy downloaded json to C:\directory for simplicity.</li>
    <li>Pubisher: Add GOOGLE_APPLICATION_CREDENTIALS=< json path >.</li>
    <li>Subscriber: Add GOOGLE_APPLICATION_CREDENTIALS=< json path >.</li>
</ol>
