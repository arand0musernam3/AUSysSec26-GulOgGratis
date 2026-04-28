package m5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f29525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f29527c;

    public e() {
        this.f29525a = new StringBuilder(16);
        this.f29526b = new ArrayList();
        this.f29527c = new ArrayList();
        new ArrayList();
    }

    public final void a(String str, int i11, int i12, String str2) {
        this.f29527c.add(new d(new n0(str2), i11, i12, str));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof h) {
            d((h) charSequence);
            return this;
        }
        this.f29525a.append(charSequence);
        return this;
    }

    public final void b(l0 l0Var, int i11, int i12) {
        this.f29527c.add(new d(l0Var, i11, i12, 8));
    }

    public final void c(String str) {
        this.f29525a.append(str);
    }

    public final void d(h hVar) {
        StringBuilder sb2 = this.f29525a;
        int length = sb2.length();
        sb2.append(hVar.f29538b);
        List list = hVar.f29537a;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) list.get(i11);
                this.f29527c.add(new d(fVar.f29529a, fVar.f29530b + length, fVar.f29531c + length, fVar.f29532d));
            }
        }
    }

    public final void e(h hVar, int i11, int i12) {
        StringBuilder sb2 = this.f29525a;
        int length = sb2.length();
        sb2.append((CharSequence) hVar.f29538b, i11, i12);
        List listA = i.a(hVar, i11, i12, null);
        if (listA != null) {
            int size = listA.size();
            for (int i13 = 0; i13 < size; i13++) {
                f fVar = (f) listA.get(i13);
                this.f29527c.add(new d(fVar.f29529a, fVar.f29530b + length, fVar.f29531c + length, fVar.f29532d));
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.f29526b;
        if (arrayList.isEmpty()) {
            s5.a.c("Nothing to pop.");
        }
        ((d) arrayList.remove(arrayList.size() - 1)).f29522c = this.f29525a.length();
    }

    public final void g(int i11) {
        ArrayList arrayList = this.f29526b;
        if (i11 >= arrayList.size()) {
            s5.a.c(i11 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i11) {
            f();
        }
    }

    public final int h(o oVar) {
        d dVar = new d(oVar, this.f29525a.length(), 0, 12);
        this.f29526b.add(dVar);
        this.f29527c.add(dVar);
        return r5.size() - 1;
    }

    public final int i(l0 l0Var) {
        d dVar = new d(l0Var, this.f29525a.length(), 0, 12);
        this.f29526b.add(dVar);
        this.f29527c.add(dVar);
        return r5.size() - 1;
    }

    public final h j() {
        StringBuilder sb2 = this.f29525a;
        String string = sb2.toString();
        ArrayList arrayList = this.f29527c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(((d) arrayList.get(i11)).a(sb2.length()));
        }
        return new h(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) {
        if (charSequence instanceof h) {
            e((h) charSequence, i11, i12);
            return this;
        }
        this.f29525a.append(charSequence, i11, i12);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        this.f29525a.append(c3);
        return this;
    }

    public e(h hVar) {
        this();
        d(hVar);
    }
}
