import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css'], // Corrected from styleUrl to styleUrls
})
export class CustomersComponent implements OnInit {
  customer: any = { _embedded: { customers: [] } }; // Initialize to a safe default state

  constructor(private http: HttpClient, private router: Router) {}

  ngOnInit(): void {
    this.http.get("http://localhost:8083/CUSTOMER-SERVICE/customers?projection=p1").subscribe({
      next: (data) => {
        this.customer = data; // Assign the fetched data
      },
      error: (err) => {
        console.error('Error fetching customers:', err); // Log error for debugging
        // Handle error by ensuring customer remains defined
        this.customer = { _embedded: { customers: [] } }; // In case of error, set to empty customers
      },
    });
  }

  // Navigate to the bill page for the selected customer
  getBill(c: any) {
    this.router.navigate(['/bill', c.id]);
  }


}
