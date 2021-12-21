#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int a; int b;
	cin >> a >> b;
	int c = 0;
	int ans = 0;
	ans += a;
	c += a;
	a = 0;
	while (true) {
		a += (c - (c % b)) / b;
		c -= (c - (c % b));
		ans += a;
		c += a;
		a = 0;
		if (c < b) {
			break;
		}
	}
	cout << ans;
}
