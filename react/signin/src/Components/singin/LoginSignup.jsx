import React from 'react'
import './LoginSignup.css'
import user_icon from '../Assets/person.png'
import email_icon from '../Assets/email.png'
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
          
          <img src={user_icon} alt="user" />
          <input type="text" />



          <div className="input">
            <img src={email_icon} alt="email" />
            <input type="email" />
          </div>

          <div className="input">
            <img src={password_icon} alt="password" />
            <input type="password" />
          </div>

        </div>

      </div>
      <div className="forgot-pass">Lost Password? <span>Click Here</span></div>
      <div className="submit-container">|
        <div className="submit">Sign up</div>
        <div className="submit">Login</div>

      </div>
    </div>
  )
}

export default LoginSignup