import React from "react";
import { useParams, Link } from "react-router-dom";

function Products() {

    const { categoryId } = useParams();

    const products = [
        { id: 1, name: '노트북', categoryId: '1' },
        { id: 2, name: '스마트폰', categoryId: '1' },
        { id: 3, name: '셔츠', categoryId: '2' },
        { id: 4, name: '청바지', categoryId: '2' },
        { id: 5, name: '사과', categoryId: '3' },
        { id: 6, name: '우유', categoryId: '3' },
    ];

    const filterProducts = products.filter(product => product.categoryId === categoryId)

    return (
        <div>
            <h1>카테고리{categoryId} 의 상품목록</h1>
            <ul>
                {filterProducts.map(product => (
                    <li key={product.id}>
                        <Link to={`/categories/${categoryId}/products/${product.id}`}>
                            {product.name}</Link>
                    </li>
                ))}
            </ul>
        </div>
    )
}
export default Products


