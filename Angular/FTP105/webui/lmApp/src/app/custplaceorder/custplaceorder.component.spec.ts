import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustplaceorderComponent } from './custplaceorder.component';

xdescribe('CustplaceorderComponent', () => {
  let component: CustplaceorderComponent;
  let fixture: ComponentFixture<CustplaceorderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustplaceorderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustplaceorderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
