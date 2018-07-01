import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FatherCreatorComponent } from './father-creator.component';

describe('FatherCreatorComponent', () => {
  let component: FatherCreatorComponent;
  let fixture: ComponentFixture<FatherCreatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FatherCreatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FatherCreatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
