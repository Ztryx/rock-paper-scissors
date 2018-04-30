<h1>Rock-Paper-Scissors Challenge</h1>
<h2>Introduction</h2>
<p>This repository has been created in order to solve the challenge the enterprise which I'm applying for had suggested<br/>
<b> What is the main point of the project? </b> <br/>
Building an effective solution that contains the implementation of the game <b>Rock, Paper, Scissors</b> with randomly choices by the players.
</p>
<p>
  The game has three views:
</p>
<ul>
  <li>
    The first one, explaining the rules of the game and giving the chance to navigate to the game or the ranking on server side: <br/>
    <img src="https://i.imgur.com/uYirZwO.png" height="500" width="400"/>
  </li>
  <li>
    The second one, We have the game! <br/>
    We can play just clicking on button Play Round and a new row will appear in the table, with the result of the match     randomly choosen. <br>
    We also can reset the table on client side. <br/>
    <img src="https://i.imgur.com/W5dm7qd.png" height="350" width="400"/>
  </li>
  <li>
    The third and last one, We have the ranking! <br/>
    We can appreciate here the general table saved on server side in memory-cache thanks to the managed bean with property <b>@ApplicationScoped</b> <br/>
    <img src="https://i.imgur.com/7CfagVO.png" height="200" width="400"/>
  </li>
</ul>
<h2>Dependencies</h2>
<p> Dependencies are managed by Maven in this project. <br/>
    Here there is the list of the tools and version I have used in order to build the project: </p>
<ul>
  <li>
    <b> JVM: </b> 8
  </li>
  <li>
    <b> Apache Maven: </b> 3.5.3
  </li>
  <li>
    <b> JUnit: </b> 3.8.1
  </li>
  <li>
    <b> Java EE </b> 7
  </li>
  <li>
    <b> JSF </b> 2.2.2
  </li>
  <li>
    <b> Guava </b> 25.0-jre
  </li>
  <li>
    <b> Primefaces </b> 6.0
  </li>
  <li>
    <b> Bootsfaces </b> 1.2.0
  </li>
</ul>
<h2>Deployment</h2>
<p> This project has been tested with <b>GlassFish 4.1.2</b> (local server).</p>


