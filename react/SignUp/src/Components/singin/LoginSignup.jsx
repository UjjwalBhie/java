import React from 'react'
import './LoginSignup.css'
import user_icon from ''
import eail_icon from '../Assets/email.png'
import password_icon from '../Assets/password.png'

const LoginSignup = () => {
  return (
    <div className='container'>
      <div className="header">
        <div className="text">Sign UP</div>
        <div className="underline"></div>
      </div>
      <div className="inputs">
        <div className="input">
          <img src="react/SignUp/src/Components/Assets/person.png"/>
          <input type="text"/>
        </div>


<div></div>
        <div className="input">
          <img src="react/SignUp/src/Components/Assets/email.png"/>
          <input type="email"/>
        </div>

        <div className="input">
          <img src="react/SignUp/src/Components/Assets/password.png"/>
          <input type="password"/>
        </div>
      </div>
      <div className="forgot-pass">Lost Password? <span>Click Here</span></div>
      <div className="submit-container">
        <div className="submit">Sign up</div>
        <div className="submit">Login</div>

      </div>
    </div>
  )
}

export default LoginSignup
