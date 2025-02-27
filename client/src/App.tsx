import React from 'react'
import "./tailwind.css";
import SearchBtn from './components/btn/SearchBtn'

function App() {
	const logo = "/logo.png"
	const iconsInfo = [
		{
			type: 'keyword',
			title: '키워드 검색',
		},
	]

	return (
		<div className='flex-row h-full border-solid border-1 w-500 border-main'>
			<div className="flex justify-center w-full bg-black">
				<img src={logo} className="w-320"/>
			</div>
			<div className="w-320 flex bg-[#F9F9F9] justify-center mx-auto my-10 p-10 rounded-lg">
				<span className="font-bold text-14">알고싶은 식품을 <span>[키워드 검색]</span>을 눌러 탐색 해 보세요!</span>
			</div>
			{iconsInfo.map(
				icon => (
						<SearchBtn type={icon.type} title={icon.title} />
				))}
				</div>
	)
}

export default App
