package u5;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Pair;
import m0.i1;
import m3.c3;
import m5.u0;
import m5.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f40768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f40770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q5.h f40771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z5.c f40772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f40773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f40774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n5.f f40775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t5.a f40776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f40777k;
    public final int l;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0685  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r41, m5.u0 r42, java.util.List r43, java.util.List r44, q5.h r45, z5.c r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.d.<init>(java.lang.String, m5.u0, java.util.List, java.util.List, q5.h, z5.c):void");
    }

    @Override // m5.v
    public final boolean a() {
        t5.a aVar = this.f40776j;
        if (aVar != null ? aVar.z() : false) {
            return true;
        }
        if (!this.f40777k && j.a(this.f40768b)) {
            t10.c cVar = i.f40791a;
            t10.c cVar2 = i.f40791a;
            c3 c3VarG = (c3) cVar2.f39648a;
            if (c3VarG == null) {
                if (l8.j.d()) {
                    c3VarG = cVar2.g();
                    cVar2.f39648a = c3VarG;
                } else {
                    c3VarG = j.f40792a;
                }
            }
            if (((Boolean) c3VarG.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // m5.v
    public final float b() {
        float f11;
        n5.f fVar = this.f40775i;
        float f12 = fVar.f30519e;
        TextPaint textPaint = fVar.f30516b;
        if (!Float.isNaN(f12)) {
            return fVar.f30519e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = fVar.f30515a;
        lineInstance.setText(new n5.c(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new a40.i(11));
        int i11 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f26486b).intValue() - ((Number) pair.f26485a).intValue() < next - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(next)));
                }
            }
            i11 = next;
        }
        if (priorityQueue.isEmpty()) {
            f11 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                i1.c();
                return 0.0f;
            }
            Pair pair2 = (Pair) it.next();
            float desiredWidth = Layout.getDesiredWidth(fVar.b(), ((Number) pair2.f26485a).intValue(), ((Number) pair2.f26486b).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(fVar.b(), ((Number) pair3.f26485a).intValue(), ((Number) pair3.f26486b).intValue(), textPaint));
            }
            f11 = desiredWidth;
        }
        fVar.f30519e = f11;
        return f11;
    }

    @Override // m5.v
    public final float c() {
        return this.f40775i.c();
    }
}
