#include <iostream>
using namespace std;
const int maxV=6;
int i, j;
//алгоритм Флойда-Уоршелла
void FU(int D[maxV][maxV], int V,int start)
{
    int k;
    for (i=0; i<V; i++) D[i][i] = 0;

    for (k=0; k<V; k++)
        for (i=0; i<V; i++)
            for (j=0; j<V; j++)
                if (D[i][k] && D[k][j] && i!=j)
                    if (D[i][k]+D[k][j]<D[i][j] || D[i][j]==0)
                        D[i][j]=D[i][k]+D[k][j];

    for (i=0; i<V; i++)
    {
        if(i==start-1){
        for (j=0; j<6; j++) {
            cout<<start<<" > "<<j+1<<" = "<<D[i][j]<<"\n";}
        }
    }
}
//главная функция
int main()
{
    int start=0;
    cout<<"Enter the number of the starting vertex >> ";
    cin>>start;
    int GR[6][6]={
            {0, 8, 4, 0, 0, 0},
            {0, 0, 0, 0, 6, 3},
            {0, 3, 0, 2, 0, 10},
            {0, 0, 0, 0, 3, 1},
            {0, 0, 0, 0, 0, 4},
            {0, 0, 0, 0, 0, 0}};
    cout<<"The length of the route from start > x\t\n";
    FU(GR, 6,start);
    return 0;
}
