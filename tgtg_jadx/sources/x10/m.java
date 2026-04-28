package x10;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43702d = r.c(null).getMaximum(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43703e = (r.c(null).getMaximum(7) + r.c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f43704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ub.a f43705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f43706c;

    public m(l lVar, b bVar) {
        this.f43704a = lVar;
        this.f43706c = bVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f43706c.f43645e;
        l lVar = this.f43704a;
        Calendar calendar = lVar.f43695a;
        int i11 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - firstDayOfWeek;
        return i12 < 0 ? i12 + lVar.f43698d : i12;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i11) {
        if (i11 < a() || i11 > c()) {
            return null;
        }
        int iA = (i11 - a()) + 1;
        Calendar calendarA = r.a(this.f43704a.f43695a);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f43704a.f43699e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f43703e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11 / this.f43704a.f43698d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            ub.a r1 = r4.f43705b
            if (r1 != 0) goto Lf
            ub.a r1 = new ub.a
            r1.<init>(r0)
            r4.f43705b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131558687(0x7f0d011f, float:1.8742697E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            x10.l r7 = r4.f43704a
            int r2 = r7.f43699e
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r5 = x10.r.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x10.m.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
