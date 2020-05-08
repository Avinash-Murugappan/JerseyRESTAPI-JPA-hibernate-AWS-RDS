import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import { Router } from '@angular/router';

@Component({
  selector: 'app-survey',
  templateUrl: './survey.component.html',
  styleUrls: ['./survey.component.css']
})
export class SurveyComponent implements OnInit {

  record:any = {}
  likedAboutCampus:any = {}
  a:any

  constructor(private http: HttpClient, private router: Router) {
   }

  ngOnInit(): void {
  }

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  onSubmit(){
    this.record.likedAboutCampus = Object.keys(this.likedAboutCampus).filter((k:any) => this.likedAboutCampus[k]).toString();
    console.log(this.record);
    this.http.post<any>("http://3.91.101.112:32063/rest/webapi/api/putRecord",this.record,this.httpOptions).subscribe(data=>{
    alert("Record added");
      this.router.navigate(['/list']);
    });
  }

}