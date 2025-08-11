
import './App.css';
import { useState } from 'react';
function LoginButton(props){
  return(
    <button onClick={props.onClick}>Login</button>
  );
}

function LogoutButton(props){
  return(
    <button onClick={props.onClick}>Logout</button>
  );
}

function Greeting(props){
  const isloggedin=props.isloggedin;
  if(isloggedin){
    return <UserPage/>;
  }
  else{
    return <GuestPage/>;
  }
}

function UserPage(){
  return(
    <div>
    <h2>Welcome User!..</h2>
    <p>You can now book ticket</p>
    <button>Book Ticket</button>
    </div>
  );
}

function GuestPage(){
  return(
   <div>
      <h2>Welcome, Guest!</h2>
      <p>Browse available flights below (booking available after login).</p>
     
      <ul>
        <li>Flight A: Chennai → Delhi</li>
        <li>Flight B: Mumbai → Kolkata</li>
      </ul>
    </div>);
}
function App() {
  const [isloggedin,setIsLoggedIn]=useState(false);
  const handleLogin=()=> setIsLoggedIn(true);
  const handleLogout=()=> setIsLoggedIn(false);
  return (
    <div className="App">
      <Greeting isloggedin={isloggedin}/>
      {isloggedin? (<LogoutButton onClick={handleLogout}/>) :(<LoginButton onClick={handleLogin}/>) }

    </div>
  );
}

export default App;
