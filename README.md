# beano.

# project-documentation

<p align="center">
  <a href="" rel="noopener">
 <img width=100px height=100px src="resources\beano_logo.png" alt="Project logo"></a>
</p>



<h3 align="center">beano. - A Social Beanfest</h3>

---
<div align="center">

  [![Status](https://img.shields.io/badge/status-active-success.svg)]()
  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/pulls)
  [![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>


## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Project View](#projectView)
- [Features](features)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>
The name 'beano' comes from old english word 'beanfest', and now-a-days it means celebration or a party. 'beano.' is a social media website which embodies the spirit of its name.

## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites
Things you need to install.
- VS Code
- Eclipse IDE
- Java Enterprise Edititon
- Nodejs
- Nextjs
- SQL

You also need to create a facebook application by going on this link https://developers.facebook.com/.
After the app is created copy your uinque CLIENT_ID AND CLIENT_SECRET into .env.local in the respective fields.

### Installing
You need to clone two repositories for this web application to work.
- beano.: https://github.com/ShubhamBarwad/beano..git
- beano-services: https://github.com/ShubhamBarwad/beano-services.git

FrontEnd Installation:

After successfully cloning the two repositories. Open the Appetite_FrontEnd with VS Code. Open the terminal in the VS Code using 'CTRL'+ ` . In the terminal install the dependencies using the following commands

```
npm install next-auth
npm install react-redux
npm install @reduxjs/toolkit
npm install axios
npm i react-router
npm i react-router-dom
npm i bcryptjs
npm install mongoose
npm install mongodb
npm install formik --save
```

Once thats done, you can run the frontend of the web-application by using the following command

```
npm run dev
```

BackEnd Installation:

Open the backend project in EclipseIDE. Verify and match the SQL server port number with the one installed in your system. Then create a database in the SQL using following command.
```
CREATE DATABASE beano_db;
```
Then run the program as Java Application on server port 8080 (It will automatically run on this port number). Once both the servers are up and running, open the following link in Chrome
```
http://localhost:3000/
```
You should see a login page if you are running it for the first time.

## 🔧 Running the tests <a name = "tests"></a>
If your application is properly running, you will be taken to login page.
Click Login. On successful login you will be redirected to the home page.


## 🎈 Project View <a name="projectView"></a>
### Login Page
<img src="resources\beano_login.png" alt= “” width="1000">


### Login Process (GIF)
<img src="resources\beano_login_process.gif" alt= “” width="1000">

### Home Page (GIF)
<img src="resources\beano_homepage.gif" alt= “” width="1000">

### Resposive (GIF)
<img src="resources\beano_responsive.gif" alt= “” width="200">

### Add Post (GIF)
<!-- ![EditDish](public\EditCartProcess.gif) -->
<img src="resources\add_post.gif" alt= “” width="1000">


## 🚀 Features <a name = "features"></a>

### User Features
- User login using Facebook accounts
- Log out user
- Add post
- Add image posts

### Other Features
- Original Design
- Material UI
- Responsive Webpages

## ✍️ Authors <a name = "authors"></a>
- [@shubham](https://github.com/ShubhamBarwad) Shubham Barwad


## 🎉 Acknowledgements <a name = "acknowledgement"></a>
- Instruction By - @juniedenysolomon
- Inspiration - @bhupendraparihar
- References - @juniedenysolomon
- Skill-Lynk - [@Skill-Lync](https://skill-lync.com/)