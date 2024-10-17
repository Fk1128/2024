import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { addToCart, removeFromCart } from './action';

function ShopApp() {
    const products = [
        { id: 1, name: 'Apple' },
        { id: 2, name: 'Banana' },
        { id: 3, name: 'Orange' },
    ]
    const cart = useSelector((state) => state.cart);
    const dispatch = useDispatch();

    const handleAddToCart = ( id,name) => {
        dispatch(addToCart( id,name)); // 제품을 카트에 추가
    };

    const handleRemoveFromCart = (id) => {
        dispatch(removeFromCart(id)); // 제품을 카트에서 제거
    };

    return (
        <div>
            <h1>Products</h1>
            <ul>
                {products.map(product => (
                    <li key={product.id}>
                        {product.name}
                        <button onClick={() => handleAddToCart(product.id,product.name)}>
                            Add to Cart
                        </button>
                    </li>
                ))}
            </ul>

            <h2>Shopping Cart</h2>
            {cart.length === 0 ? (
                <p>Your cart is empty</p>
            ) : (
                <ul>
                    {cart.map(item => (
                        <li key={item.id}>
                            {item.name} (x{item.quantity})
                            <button onClick={() => handleRemoveFromCart(item.id)}>
                                Remove
                            </button>
                        </li>
                    ))}
                </ul>
            )}
        </div>
    );
}

export default ShopApp;
