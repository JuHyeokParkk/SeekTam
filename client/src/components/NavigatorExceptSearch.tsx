import React from 'react';
import { FiArrowLeftCircle } from 'react-icons/fi';
import { Link, useNavigate } from 'react-router-dom';
export default function Navigator() {
    const navigate = useNavigate()

    const handleClick = () => {
        navigate(-1)
    }
    return (
        <div className='flex justify-between mt-15 mx-20'>
            <button className=''>
                <FiArrowLeftCircle size={26} className='text-main' onClick={handleClick}/>
            </button>
            <Link to='/'>
                <button>
                    <span className='text-main text-20 font-bold w-40'>식탐</span>
                </button>
            </Link>
            <div className='ml-10'></div>
        </div>
    );
}

