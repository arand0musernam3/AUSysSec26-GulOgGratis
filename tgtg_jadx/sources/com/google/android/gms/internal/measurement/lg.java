package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class lg extends tg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg(String str, Class cls, boolean z11, boolean z12, int i11) {
        super(str, cls, z11, z12);
        this.f11607f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.tg
    public void a(Iterator it, gh ghVar) {
        switch (this.f11607f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.f11907a;
                    if (!zHasNext) {
                        ghVar.a(next, str);
                    } else {
                        StringBuilder sb2 = new StringBuilder("[");
                        sb2.append(next);
                        do {
                            sb2.append(',');
                            sb2.append(it.next());
                        } while (it.hasNext());
                        sb2.append(']');
                        ghVar.a(sb2.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, ghVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.tg
    public void b(Object obj, gh ghVar) {
        switch (this.f11607f) {
            case 1:
                y yVar = (y) obj;
                if (yVar != null) {
                    v vVar = yVar.f12048a.f11976c;
                    vVar.getClass();
                    int i11 = 0;
                    while (true) {
                        if (!(i11 < vVar.c() - vVar.b())) {
                            break;
                        } else if (i11 >= vVar.c() - vVar.b()) {
                            m0.i1.c();
                            break;
                        } else {
                            w wVar = vVar.f11949b;
                            int iB = vVar.b() + i11;
                            i11++;
                            Map.Entry entry = (Map.Entry) wVar.f11974a[iB];
                            if (((Set) entry.getValue()).isEmpty()) {
                                ghVar.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    ghVar.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, ghVar);
                break;
        }
    }
}
