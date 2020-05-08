import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  list=null;
  constructor(private http: HttpClient) { }


  ngOnInit(): void {
    this.http.get<any>('http://3.91.101.112:32063/rest/webapi/api/getRecords').subscribe(data => {
    this.list = data;
    })
  }
}