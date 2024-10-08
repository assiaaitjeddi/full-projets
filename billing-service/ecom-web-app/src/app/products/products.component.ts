import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css'] // Fixed styleUrl to styleUrls
})
export class ProductsComponent implements OnInit {
  products: any;

  constructor(private http: HttpClient) {}

  ngOnInit() {
    //http://localhost:8083/INVENTORY-SERVICE/products?projection=p1
    this.http.get("http://localhost:8083/INVENTORY-SERVICE/products").subscribe({
      next: (data) => {
        this.products = data; // Assign the fetched data
      },
      error: (err) => {
        console.error('Error fetching products:', err); // Log error for debugging
      }
    });
  }
}
