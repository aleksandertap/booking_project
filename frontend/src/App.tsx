import { useState, useEffect } from 'react'
import axios from 'axios'
import './App.css'

function App() {
  const [backendMessage, setBackendMessage] = useState('Loading message from backend...')

  useEffect(() => {
    // Vite proxy catches '/api' and routes it to http://localhost:8080/api/hello
    axios.get('/api/hello')
      .then(response => {
        setBackendMessage(response.data.message)
      })
      .catch(error => {
        console.error("Error connecting to backend:", error)
        setBackendMessage('Failed to connect to backend.')
      })
  }, [])

  return (
    <div style={{ textAlign: 'center', marginTop: '50px', fontFamily: 'Arial' }}>
      <h1>My Fullstack Application</h1>
      <div style={{ border: '2px solid #4CAF50', padding: '20px', display: 'inline-block', borderRadius: '8px' }}>
        <h3>Backend Status:</h3>
        <p style={{ fontSize: '18px', color: '#2196F3', fontWeight: 'bold' }}>{backendMessage}</p>
      </div>
    </div>
  )
}

export default App