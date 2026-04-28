package l8;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f27488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27489b;

    public v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f27489b = new ArrayList();
        pd.g.m(cls, "watcherClass cannot be null");
        this.f27488a = cls;
    }

    public final void a() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f27489b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i11)).f27487b.incrementAndGet();
            i11++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f27489b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i11)).onTextChanged(this, 0, length(), length());
            i11++;
        }
    }

    public final u c(Object obj) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f27489b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            u uVar = (u) arrayList.get(i11);
            if (uVar.f27486a == obj) {
                return uVar;
            }
            i11++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f27488a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    public final void e() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f27489b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i11)).f27487b.decrementAndGet();
            i11++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i11, int i12, Class cls) {
        if (this.f27488a != cls) {
            return super.getSpans(i11, i12, cls);
        }
        u[] uVarArr = (u[]) super.getSpans(i11, i12, u.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, uVarArr.length);
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            objArr[i13] = uVarArr[i13].f27486a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i11, int i12, Class cls) {
        if (cls == null || this.f27488a == cls) {
            cls = u.class;
        }
        return super.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        u uVarC;
        if (d(obj)) {
            uVarC = c(obj);
            if (uVarC != null) {
                obj = uVarC;
            }
        } else {
            uVarC = null;
        }
        super.removeSpan(obj);
        if (uVarC != null) {
            this.f27489b.remove(uVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        a();
        super.replace(i11, i12, charSequence, i13, i14);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i11, int i12, int i13) {
        if (d(obj)) {
            u uVar = new u(obj);
            this.f27489b.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i11, i12, i13);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return new v(this.f27488a, this, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        replace(i11, i12, charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i11) {
        super.append(charSequence, obj, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence) {
        a();
        super.replace(i11, i12, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i11, int i12, CharSequence charSequence) {
        replace(i11, i12, charSequence);
        return this;
    }

    public v(Class cls, v vVar, int i11, int i12) {
        super(vVar, i11, i12);
        this.f27489b = new ArrayList();
        pd.g.m(cls, "watcherClass cannot be null");
        this.f27488a = cls;
    }
}
