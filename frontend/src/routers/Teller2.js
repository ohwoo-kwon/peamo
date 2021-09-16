import { useEffect } from 'react'
import './Teller2.css'
import Teller21 from '../components/TellerComponents/Teller2-1'
import Teller22 from '../components/TellerComponents/Teller2-2'
import Teller23 from '../components/TellerComponents/Teller2-3'
import Teller24 from '../components/TellerComponents/Teller2-4'


function Teller2({location}) {

  // header 검은색으로 변경
  useEffect(() => {
    const header = document.querySelector('header')
    header.style.backgroundColor = '#1C1C1C'
  }, [])
  // header 검은색으로 변경

  // Teller1에서 받아온 props
  const question = location.state.question;

  return (
    <div class="teller2">
      {
        question === 1 && <Teller21></Teller21>
      }
      {
        question === 2 && <Teller22></Teller22>
      }
      {
        question === 3 && <Teller23></Teller23>
      }
      {
        question === 4 && <Teller24></Teller24>
      }
    </div>
  )
}

export default Teller2