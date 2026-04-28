package zw;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f48327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f48329c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f48330d = null;

    public q(f fVar, String str) {
        this.f48327a = null;
        this.f48328b = null;
        this.f48327a = fVar == null ? f.DESCENDANT : fVar;
        this.f48328b = str;
    }

    public final void a(String str, d dVar, String str2) {
        if (this.f48329c == null) {
            this.f48329c = new ArrayList();
        }
        this.f48329c.add(new c(str, dVar, str2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        f fVar = f.CHILD;
        f fVar2 = this.f48327a;
        if (fVar2 == fVar) {
            sb2.append("> ");
        } else if (fVar2 == f.FOLLOWS) {
            sb2.append("+ ");
        }
        String str = this.f48328b;
        if (str == null) {
            str = "*";
        }
        sb2.append(str);
        ArrayList<c> arrayList = this.f48329c;
        if (arrayList != null) {
            for (c cVar : arrayList) {
                sb2.append('[');
                String str2 = cVar.f48169a;
                String str3 = cVar.f48171c;
                sb2.append(str2);
                int i11 = b.f48163a[cVar.f48170b.ordinal()];
                if (i11 == 1) {
                    sb2.append('=');
                    sb2.append(str3);
                } else if (i11 == 2) {
                    sb2.append("~=");
                    sb2.append(str3);
                } else if (i11 == 3) {
                    sb2.append("|=");
                    sb2.append(str3);
                }
                sb2.append(']');
            }
        }
        ArrayList<h> arrayList2 = this.f48330d;
        if (arrayList2 != null) {
            for (h hVar : arrayList2) {
                sb2.append(':');
                sb2.append(hVar);
            }
        }
        return sb2.toString();
    }
}
