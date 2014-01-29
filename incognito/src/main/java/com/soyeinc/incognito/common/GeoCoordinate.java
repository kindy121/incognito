package com.soyeinc.incognito.common;

public abstract class GeoCoordinate {
	
	public int deg;
	public int min;
	public int sec;

	public GeoCoordinate(int deg, int min, int sec)
	{
		this.deg = deg;
		this.min = min;
		this.sec = sec;
	}
	
	public boolean equals(GeoCoordinate other)
	{
		
		if (this == other)
		{
			return true;
		}
		
		if (this.deg != other.getDeg())
		{
			return false;
		}
		
		if (this.min != other.getMin())
		{
			return false;
		}
		
		if (this.sec != other.getSec())
		{
			return false;
		}
	
		return true;
	}

	public int getSec() {
		return this.sec;
	}

	public int getMin() {
		return this.min;
	}

	public int getDeg() {
		return this.deg;
	}
	
	public double getDecimalValue()
	{
		return this.getDeg() + (this.getMin()/60) + (this.getSec()/3600);
	}
}
