import { Component, OnInit, ViewChild} from '@angular/core';
import { Router } from '@angular/router';
import {MatPaginator, MatTableDataSource} from '@angular/material';

import { FamilyService } from '../shared/family.service';
import { Family } from '../shared/models/family.model';
import { Father } from '../shared/models/father.model';
import { Child } from '../shared/models/child.model';
import { FamModel } from '../shared/models/famModel.model';

@Component({
  selector: 'app-family-list',
  templateUrl: './family-list.component.html',
  styleUrls: ['./family-list.component.css']
})
export class FamilyListComponent implements OnInit {

  famModel: FamModel;
  dataSource = new MatTableDataSource(this.famModel);
  displayedColumns: string[] = ['id','first_name','last_name','pesel','birth_date'];
  
  @ViewChild(MatPaginator) paginator: MatPaginator;


  constructor(private router: Router, private familyService: FamilyService) { }

  ngOnInit() {
	  this.familyService.readFamily(1).subscribe ( data => { this.famModel = data; this.dataSource.data = this.famModel
	  this.dataSource.paginator = this.paginator;
  )};

} 
