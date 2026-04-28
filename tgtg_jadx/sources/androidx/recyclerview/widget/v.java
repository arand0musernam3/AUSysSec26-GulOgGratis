package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f3939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f3940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3943g;

    public v(t tVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i11;
        u uVar;
        int i12;
        this.f3937a = arrayList;
        this.f3938b = iArr;
        this.f3939c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f3940d = tVar;
        int oldListSize = tVar.getOldListSize();
        this.f3941e = oldListSize;
        int newListSize = tVar.getNewListSize();
        this.f3942f = newListSize;
        this.f3943g = true;
        u uVar2 = arrayList.isEmpty() ? null : (u) arrayList.get(0);
        if (uVar2 == null || uVar2.f3927a != 0 || uVar2.f3928b != 0) {
            arrayList.add(0, new u(0, 0, 0));
        }
        arrayList.add(new u(oldListSize, newListSize, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u uVar3 = (u) it.next();
            for (int i13 = 0; i13 < uVar3.f3929c; i13++) {
                int i14 = uVar3.f3927a + i13;
                int i15 = uVar3.f3928b + i13;
                int i16 = tVar.areContentsTheSame(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 4) | i16;
                iArr2[i15] = (i14 << 4) | i16;
            }
        }
        if (this.f3943g) {
            Iterator it2 = arrayList.iterator();
            int i17 = 0;
            while (it2.hasNext()) {
                u uVar4 = (u) it2.next();
                while (true) {
                    i11 = uVar4.f3927a;
                    if (i17 < i11) {
                        if (iArr[i17] == 0) {
                            int size = arrayList.size();
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i18 < size) {
                                    uVar = (u) arrayList.get(i18);
                                    while (true) {
                                        i12 = uVar.f3928b;
                                        if (i19 < i12) {
                                            if (iArr2[i19] == 0 && tVar.areItemsTheSame(i17, i19)) {
                                                int i21 = tVar.areContentsTheSame(i17, i19) ? 8 : 4;
                                                iArr[i17] = (i19 << 4) | i21;
                                                iArr2[i19] = i21 | (i17 << 4);
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                }
                                i19 = uVar.f3929c + i12;
                                i18++;
                            }
                        }
                        i17++;
                    }
                }
                i17 = uVar4.f3929c + i11;
            }
        }
    }

    public static x b(ArrayDeque arrayDeque, int i11, boolean z11) {
        x xVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                xVar = null;
                break;
            }
            xVar = (x) it.next();
            if (xVar.f3964a == i11 && xVar.f3966c == z11) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            x xVar2 = (x) it.next();
            if (z11) {
                xVar2.f3965b--;
            } else {
                xVar2.f3965b++;
            }
        }
        return xVar;
    }

    public final void a(c cVar) {
        int[] iArr;
        t tVar;
        int i11;
        int i12;
        ArrayList arrayList;
        v vVar = this;
        i iVar = new i(cVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = vVar.f3937a;
        boolean z11 = true;
        int size = arrayList2.size() - 1;
        int i13 = vVar.f3941e;
        int i14 = vVar.f3942f;
        int i15 = i13;
        while (size >= 0) {
            u uVar = (u) arrayList2.get(size);
            int i16 = uVar.f3927a;
            int i17 = uVar.f3929c;
            int i18 = i16 + i17;
            int i19 = uVar.f3928b;
            int i21 = i19 + i17;
            while (true) {
                iArr = vVar.f3938b;
                tVar = vVar.f3940d;
                boolean z12 = z11;
                i11 = 0;
                if (i15 <= i18) {
                    break;
                }
                i15--;
                int i22 = iArr[i15];
                if ((i22 & 12) != 0) {
                    arrayList = arrayList2;
                    int i23 = i22 >> 4;
                    x xVarB = b(arrayDeque, i23, false);
                    if (xVarB != null) {
                        int i24 = (i13 - xVarB.f3965b) - 1;
                        iVar.a(i15, i24);
                        if ((i22 & 4) != 0) {
                            iVar.d(i24, z12 ? 1 : 0, tVar.getChangePayload(i15, i23));
                        }
                    } else {
                        arrayDeque.add(new x(i15, (i13 - i15) - (z12 ? 1 : 0), z12));
                    }
                } else {
                    arrayList = arrayList2;
                    iVar.c(i15, z12 ? 1 : 0);
                    i13--;
                }
                arrayList2 = arrayList;
                z11 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i14 > i21) {
                i14--;
                int i25 = vVar.f3939c[i14];
                if ((i25 & 12) != 0) {
                    int i26 = i25 >> 4;
                    x xVarB2 = b(arrayDeque, i26, true);
                    if (xVarB2 == null) {
                        arrayDeque.add(new x(i14, i13 - i15, false));
                        i12 = 0;
                    } else {
                        i12 = 0;
                        iVar.a((i13 - xVarB2.f3965b) - 1, i15);
                        if ((i25 & 4) != 0) {
                            iVar.d(i15, 1, tVar.getChangePayload(i26, i14));
                        }
                    }
                } else {
                    i12 = i11;
                    iVar.b(i15, 1);
                    i13++;
                }
                vVar = this;
                i11 = i12;
            }
            int i27 = i19;
            int i28 = i16;
            while (i11 < i17) {
                if ((iArr[i28] & 15) == 2) {
                    iVar.d(i28, 1, tVar.getChangePayload(i28, i27));
                }
                i28++;
                i27++;
                i11++;
            }
            size--;
            vVar = this;
            z11 = true;
            i14 = i19;
            i15 = i16;
            arrayList2 = arrayList3;
        }
        iVar.e();
    }
}
