package qa;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends y {
    public ArrayList G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public y[] L;

    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = new ArrayList();
        this.H = true;
        this.J = false;
        this.K = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f36724f);
        W(w6.a.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // qa.y
    public final void D(View view) {
        super.D(view);
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((y) this.G.get(i11)).D(view);
        }
    }

    @Override // qa.y
    public final void E() {
        this.f36773z = 0L;
        int i11 = 0;
        d0 d0Var = new d0(this, i11);
        while (i11 < this.G.size()) {
            y yVar = (y) this.G.get(i11);
            yVar.a(d0Var);
            yVar.E();
            long j9 = yVar.f36773z;
            boolean z11 = this.H;
            long j11 = this.f36773z;
            if (z11) {
                this.f36773z = Math.max(j11, j9);
            } else {
                yVar.B = j11;
                this.f36773z = j11 + j9;
            }
            i11++;
        }
    }

    @Override // qa.y
    public final y F(w wVar) {
        super.F(wVar);
        return this;
    }

    @Override // qa.y
    public final void G(View view) {
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            ((y) this.G.get(i11)).G(view);
        }
        this.f36754f.remove(view);
    }

    @Override // qa.y
    public final void H(View view) {
        super.H(view);
        y[] yVarArr = this.L;
        this.L = null;
        if (yVarArr == null) {
            yVarArr = new y[this.G.size()];
        }
        y[] yVarArr2 = (y[]) this.G.toArray(yVarArr);
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            yVarArr2[i11].H(view);
        }
        Arrays.fill(yVarArr2, (Object) null);
        this.L = yVarArr2;
    }

    @Override // qa.y
    public final void I() {
        ArrayList arrayList;
        if (this.G.isEmpty()) {
            Q();
            o();
            return;
        }
        d0 d0Var = new d0();
        d0Var.f36662b = this;
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((y) it.next()).a(d0Var);
        }
        this.I = this.G.size();
        if (this.H) {
            Iterator it2 = this.G.iterator();
            while (it2.hasNext()) {
                ((y) it2.next()).I();
            }
            return;
        }
        int i11 = 1;
        while (true) {
            int size = this.G.size();
            arrayList = this.G;
            if (i11 >= size) {
                break;
            }
            ((y) arrayList.get(i11 - 1)).a(new d0((y) this.G.get(i11), 2));
            i11++;
        }
        y yVar = (y) arrayList.get(0);
        if (yVar != null) {
            yVar.I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // qa.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(long r20, long r22) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.e0.J(long, long):void");
    }

    @Override // qa.y
    public final void L(s sVar) {
        this.f36771x = sVar;
        this.K |= 8;
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((y) this.G.get(i11)).L(sVar);
        }
    }

    @Override // qa.y
    public final void N(ky.p pVar) {
        super.N(pVar);
        this.K |= 4;
        if (this.G != null) {
            for (int i11 = 0; i11 < this.G.size(); i11++) {
                ((y) this.G.get(i11)).N(pVar);
            }
        }
    }

    @Override // qa.y
    public final void O(o oVar) {
        this.f36770w = oVar;
        this.K |= 2;
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((y) this.G.get(i11)).O(oVar);
        }
    }

    @Override // qa.y
    public final void P(long j9) {
        this.f36750b = j9;
    }

    @Override // qa.y
    public final String R(String str) {
        String strR = super.R(str);
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            StringBuilder sbR = e0.f.r(strR, "\n");
            sbR.append(((y) this.G.get(i11)).R(str.concat("  ")));
            strR = sbR.toString();
        }
        return strR;
    }

    public final void S(y yVar) {
        this.G.add(yVar);
        yVar.f36758j = this;
        long j9 = this.f36751c;
        if (j9 >= 0) {
            yVar.K(j9);
        }
        if ((this.K & 1) != 0) {
            yVar.M(this.f36752d);
        }
        if ((this.K & 2) != 0) {
            yVar.O(this.f36770w);
        }
        if ((this.K & 4) != 0) {
            yVar.N(this.f36772y);
        }
        if ((this.K & 8) != 0) {
            yVar.L(this.f36771x);
        }
    }

    public final y T(int i11) {
        if (i11 < 0 || i11 >= this.G.size()) {
            return null;
        }
        return (y) this.G.get(i11);
    }

    @Override // qa.y
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void K(long j9) {
        ArrayList arrayList;
        this.f36751c = j9;
        if (j9 < 0 || (arrayList = this.G) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((y) this.G.get(i11)).K(j9);
        }
    }

    @Override // qa.y
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void M(TimeInterpolator timeInterpolator) {
        this.K |= 1;
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((y) this.G.get(i11)).M(timeInterpolator);
            }
        }
        this.f36752d = timeInterpolator;
    }

    public final void W(int i11) {
        if (i11 == 0) {
            this.H = true;
        } else {
            if (i11 != 1) {
                throw new AndroidRuntimeException(j4.s.f(i11, "Invalid parameter for TransitionSet ordering: "));
            }
            this.H = false;
        }
    }

    @Override // qa.y
    public final void b(View view) {
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            ((y) this.G.get(i11)).b(view);
        }
        this.f36754f.add(view);
    }

    @Override // qa.y
    public final void cancel() {
        super.cancel();
        y[] yVarArr = this.L;
        this.L = null;
        if (yVarArr == null) {
            yVarArr = new y[this.G.size()];
        }
        y[] yVarArr2 = (y[]) this.G.toArray(yVarArr);
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            yVarArr2[i11].cancel();
        }
        Arrays.fill(yVarArr2, (Object) null);
        this.L = yVarArr2;
    }

    @Override // qa.y
    public final void d(h0 h0Var) {
        View view = h0Var.f36674b;
        if (A(view)) {
            for (y yVar : this.G) {
                if (yVar.A(view)) {
                    yVar.d(h0Var);
                    h0Var.f36675c.add(yVar);
                }
            }
        }
    }

    @Override // qa.y
    public final void h(h0 h0Var) {
        super.h(h0Var);
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((y) this.G.get(i11)).h(h0Var);
        }
    }

    @Override // qa.y
    public final void i(h0 h0Var) {
        View view = h0Var.f36674b;
        if (A(view)) {
            for (y yVar : this.G) {
                if (yVar.A(view)) {
                    yVar.i(h0Var);
                    h0Var.f36675c.add(yVar);
                }
            }
        }
    }

    @Override // qa.y
    /* JADX INFO: renamed from: l */
    public final y clone() {
        e0 e0Var = (e0) super.clone();
        e0Var.G = new ArrayList();
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            y yVarClone = ((y) this.G.get(i11)).clone();
            e0Var.G.add(yVarClone);
            yVarClone.f36758j = e0Var;
        }
        return e0Var;
    }

    @Override // qa.y
    public final void n(ViewGroup viewGroup, com.google.firebase.messaging.a0 a0Var, com.google.firebase.messaging.a0 a0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j9 = this.f36750b;
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            y yVar = (y) this.G.get(i11);
            if (j9 > 0 && (this.H || i11 == 0)) {
                long j11 = yVar.f36750b;
                if (j11 > 0) {
                    yVar.P(j11 + j9);
                } else {
                    yVar.P(j9);
                }
            }
            yVar.n(viewGroup, a0Var, a0Var2, arrayList, arrayList2);
        }
    }

    @Override // qa.y
    public final void q() {
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            ((y) this.G.get(i11)).q();
        }
        super.q();
    }

    @Override // qa.y
    public final boolean x() {
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            if (((y) this.G.get(i11)).x()) {
                return true;
            }
        }
        return false;
    }

    @Override // qa.y
    public final boolean y() {
        int size = this.G.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!((y) this.G.get(i11)).y()) {
                return false;
            }
        }
        return true;
    }

    public e0() {
        this.G = new ArrayList();
        this.H = true;
        this.J = false;
        this.K = 0;
    }
}
