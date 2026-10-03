import React from 'react';

const Layout = (props) => {

  return (
    <div>
      {props.data.map((e,i,arr)=>{
        return <div>
          <img src={e.image} alt="" />
          <h4>{e.title}</h4>
          <h2>Price: {e.price}</h2>
          <h5>Rating: {e.rating}</h5>
      </div>
        })
      }
    </div>
  )
}

export default Layout;