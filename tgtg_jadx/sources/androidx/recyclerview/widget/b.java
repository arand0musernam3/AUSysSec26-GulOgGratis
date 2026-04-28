package androidx.recyclerview.widget;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f3665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f3666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3668f;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [float[], java.io.Serializable] */
    public b() {
        this.f3664b = new z4.q[32];
        this.f3665c = new float[32];
        this.f3666d = new byte[32];
        q1.u0 u0Var = q1.j1.f35777a;
        this.f3667e = new q1.u0();
        this.f3668f = new q1.u0();
    }

    public boolean a(int i11) {
        ArrayList arrayList = (ArrayList) this.f3666d;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) arrayList.get(i12);
            int i13 = aVar.f3650a;
            if (i13 != 8) {
                if (i13 == 1) {
                    int i14 = aVar.f3651b;
                    int i15 = aVar.f3653d + i14;
                    while (i14 < i15) {
                        if (f(i14, i12 + 1) == i11) {
                            return true;
                        }
                        i14++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(aVar.f3653d, i12 + 1) == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f3666d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((j1) this.f3667e).d((a) arrayList.get(i11));
        }
        k(arrayList);
        this.f3663a = 0;
    }

    public void c() {
        j1 j1Var = (j1) this.f3667e;
        b();
        ArrayList arrayList = (ArrayList) this.f3665c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f3650a;
            if (i12 == 1) {
                j1Var.d(aVar);
                j1Var.g(aVar.f3651b, aVar.f3653d);
            } else if (i12 == 2) {
                j1Var.d(aVar);
                int i13 = aVar.f3651b;
                int i14 = aVar.f3653d;
                RecyclerView recyclerView = j1Var.f3791a;
                recyclerView.U(i13, i14, true);
                recyclerView.f3605q1 = true;
                recyclerView.f3599n1.f3828c += i14;
            } else if (i12 == 4) {
                j1Var.d(aVar);
                j1Var.f(aVar.f3651b, aVar.f3653d, aVar.f3652c);
            } else if (i12 == 8) {
                j1Var.d(aVar);
                j1Var.h(aVar.f3651b, aVar.f3653d);
            }
        }
        k(arrayList);
        this.f3663a = 0;
    }

    public void d(a aVar) {
        int i11;
        g6.e eVar = (g6.e) this.f3664b;
        int i12 = aVar.f3650a;
        if (i12 == 1 || i12 == 8) {
            i4.a.f("should not dispatch add or move for pre layout");
            return;
        }
        int iL = l(aVar.f3651b, i12);
        int i13 = aVar.f3651b;
        int i14 = aVar.f3650a;
        if (i14 == 2) {
            i11 = 0;
        } else {
            if (i14 != 4) {
                j4.d.o(aVar, "op should be remove or update.");
                return;
            }
            i11 = 1;
        }
        int i15 = 1;
        for (int i16 = 1; i16 < aVar.f3653d; i16++) {
            int iL2 = l((i11 * i16) + aVar.f3651b, aVar.f3650a);
            int i17 = aVar.f3650a;
            if (i17 == 2 ? iL2 != iL : !(i17 == 4 && iL2 == iL + 1)) {
                a aVarH = h(aVar.f3652c, i17, iL, i15);
                e(aVarH, i13);
                aVarH.f3652c = null;
                eVar.c(aVarH);
                if (aVar.f3650a == 4) {
                    i13 += i15;
                }
                i15 = 1;
                iL = iL2;
            } else {
                i15++;
            }
        }
        Object obj = aVar.f3652c;
        aVar.f3652c = null;
        eVar.c(aVar);
        if (i15 > 0) {
            a aVarH2 = h(obj, aVar.f3650a, iL, i15);
            e(aVarH2, i13);
            aVarH2.f3652c = null;
            eVar.c(aVarH2);
        }
    }

    public void e(a aVar, int i11) {
        j1 j1Var = (j1) this.f3667e;
        j1Var.d(aVar);
        int i12 = aVar.f3650a;
        if (i12 != 2) {
            if (i12 == 4) {
                j1Var.f(i11, aVar.f3653d, aVar.f3652c);
                return;
            } else {
                i4.a.f("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i13 = aVar.f3653d;
        RecyclerView recyclerView = j1Var.f3791a;
        recyclerView.U(i11, i13, true);
        recyclerView.f3605q1 = true;
        recyclerView.f3599n1.f3828c += i13;
    }

    public int f(int i11, int i12) {
        ArrayList arrayList = (ArrayList) this.f3666d;
        int size = arrayList.size();
        while (i12 < size) {
            a aVar = (a) arrayList.get(i12);
            int i13 = aVar.f3650a;
            int i14 = aVar.f3651b;
            if (i13 == 8) {
                if (i14 == i11) {
                    i11 = aVar.f3653d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (aVar.f3653d <= i11) {
                        i11++;
                    }
                }
            } else if (i14 > i11) {
                continue;
            } else if (i13 == 2) {
                int i15 = aVar.f3653d;
                if (i11 < i14 + i15) {
                    return -1;
                }
                i11 -= i15;
            } else if (i13 == 1) {
                i11 += aVar.f3653d;
            }
            i12++;
        }
        return i11;
    }

    public boolean g() {
        return ((ArrayList) this.f3665c).size() > 0;
    }

    public a h(Object obj, int i11, int i12, int i13) {
        a aVar = (a) ((g6.e) this.f3664b).a();
        if (aVar != null) {
            aVar.f3650a = i11;
            aVar.f3651b = i12;
            aVar.f3653d = i13;
            aVar.f3652c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f3650a = i11;
        aVar2.f3651b = i12;
        aVar2.f3653d = i13;
        aVar2.f3652c = obj;
        return aVar2;
    }

    public void i(a aVar) {
        j1 j1Var = (j1) this.f3667e;
        ((ArrayList) this.f3666d).add(aVar);
        int i11 = aVar.f3650a;
        if (i11 == 1) {
            j1Var.g(aVar.f3651b, aVar.f3653d);
            return;
        }
        if (i11 == 2) {
            int i12 = aVar.f3651b;
            int i13 = aVar.f3653d;
            RecyclerView recyclerView = j1Var.f3791a;
            recyclerView.U(i12, i13, false);
            recyclerView.f3605q1 = true;
            return;
        }
        if (i11 == 4) {
            j1Var.f(aVar.f3651b, aVar.f3653d, aVar.f3652c);
        } else if (i11 == 8) {
            j1Var.h(aVar.f3651b, aVar.f3653d);
        } else {
            j4.d.o(aVar, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.j():void");
    }

    public void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            aVar.f3652c = null;
            ((g6.e) this.f3664b).c(aVar);
        }
        arrayList.clear();
    }

    public int l(int i11, int i12) {
        int i13;
        int i14;
        g6.e eVar = (g6.e) this.f3664b;
        ArrayList arrayList = (ArrayList) this.f3666d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i15 = aVar.f3650a;
            int i16 = aVar.f3651b;
            if (i15 == 8) {
                int i17 = aVar.f3653d;
                if (i16 < i17) {
                    i14 = i17;
                    i13 = i16;
                } else {
                    i13 = i17;
                    i14 = i16;
                }
                if (i11 < i13 || i11 > i14) {
                    if (i11 < i16) {
                        if (i12 == 1) {
                            aVar.f3651b = i16 + 1;
                            aVar.f3653d = i17 + 1;
                        } else if (i12 == 2) {
                            aVar.f3651b = i16 - 1;
                            aVar.f3653d = i17 - 1;
                        }
                    }
                } else if (i13 == i16) {
                    if (i12 == 1) {
                        aVar.f3653d = i17 + 1;
                    } else if (i12 == 2) {
                        aVar.f3653d = i17 - 1;
                    }
                    i11++;
                } else {
                    if (i12 == 1) {
                        aVar.f3651b = i16 + 1;
                    } else if (i12 == 2) {
                        aVar.f3651b = i16 - 1;
                    }
                    i11--;
                }
            } else if (i16 <= i11) {
                if (i15 == 1) {
                    i11 -= aVar.f3653d;
                } else if (i15 == 2) {
                    i11 += aVar.f3653d;
                }
            } else if (i12 == 1) {
                aVar.f3651b = i16 + 1;
            } else if (i12 == 2) {
                aVar.f3651b = i16 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            int i18 = aVar2.f3650a;
            int i19 = aVar2.f3653d;
            if (i18 == 8) {
                if (i19 == aVar2.f3651b || i19 < 0) {
                    arrayList.remove(size2);
                    aVar2.f3652c = null;
                    eVar.c(aVar2);
                }
            } else if (i19 <= 0) {
                arrayList.remove(size2);
                aVar2.f3652c = null;
                eVar.c(aVar2);
            }
        }
        return i11;
    }

    public void m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(ax.a0.a()).edit();
        Long l = (Long) this.f3664b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l7 = (Long) this.f3665c;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l7 != null ? l7.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f3663a);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.f3666d).toString());
        editorEdit.apply();
        nx.n nVar = (nx.n) this.f3668f;
        if (nVar == null || nVar == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(ax.a0.a()).edit();
        editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", nVar.f31449c);
        editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", nVar.f31448b);
        editorEdit2.apply();
    }

    public b(Long l, Long l7) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f3664b = l;
        this.f3665c = l7;
        this.f3666d = uuidRandomUUID;
    }
}
