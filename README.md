# Udash example

This is a minimal udash setup with [Bootstrap](https://guide.udash.io/ext/bootstrap). There are only two files

- `example/Hello.scala` which contains "hello world" from https://udash.io/demo/hello
- `index.html`

## How to run

1. `sbt`
1. `~fastOptJS` which generates `udash-example/target/scala-2.12/udash-example-fastopt.js`
1. Point the browser at `index.html` found at the root of the project which links to `udash-example-fastopt.js` like so

    ```
    <script type="text/javascript" src="./target/scala-2.12/udash-example-fastopt.js"></script>
    ``` 

