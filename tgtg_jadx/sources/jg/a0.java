package jg;

import com.app.tgtg.customview.manufactureaddressfragment.AddressEditText;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.response.AddressField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg.r f25145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cj.e0 f25146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final XmlCheckoutAddressFragment f25148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f25149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nr.a f25152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f25153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UserAddress f25154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25155k;
    public com.google.android.material.bottomsheet.l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f25157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f25158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f25159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z f25160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f25161r;

    public a0(pg.r rVar, cj.e0 e0Var, String str, XmlCheckoutAddressFragment xmlCheckoutAddressFragment) {
        rVar.getClass();
        e0Var.getClass();
        this.f25145a = rVar;
        this.f25146b = e0Var;
        this.f25147c = str;
        this.f25148d = xmlCheckoutAddressFragment;
        this.f25157n = new LinkedHashMap();
        this.f25158o = new LinkedHashMap();
    }

    public static String d(String str) {
        String strReplace = str != null ? new Regex("[^0-9 ]").replace(str, "") : null;
        return strReplace == null ? "" : strReplace;
    }

    public final void a(AddressField addressField, AddressEditText addressEditText) {
        if (c().k(addressField)) {
            if (addressEditText != null) {
                this.f25157n.put(addressField, addressEditText);
            }
            this.f25158o.put(addressField, Boolean.FALSE);
        }
    }

    public final void b() {
        if (this.f25160q != null) {
            return;
        }
        this.f25160q = new z(this, new Ref.BooleanRef());
        this.f25145a.C.getEt().addTextChangedListener(this.f25160q);
    }

    public final j c() {
        j jVar = this.f25153i;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addressSpec");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x061e  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r25v1, types: [android.view.View, com.app.tgtg.customview.manufactureaddressfragment.AddressEditText] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39, types: [int] */
    /* JADX WARN: Type inference failed for: r4v42, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r5v26, types: [android.view.View, com.app.tgtg.customview.manufactureaddressfragment.AddressEditText] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.fragment.app.o0 r47, final java.util.List r48, final java.util.List r49, final boolean r50) {
        /*
            Method dump skipped, instruction units count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.a0.e(androidx.fragment.app.o0, java.util.List, java.util.List, boolean):void");
    }

    public final void f() {
        if (this.f25160q != null) {
            this.f25145a.C.getEt().removeTextChangedListener(this.f25160q);
            this.f25160q = null;
        }
    }

    public final void g(String str) {
        o oVar;
        this.f25161r = str;
        if (str == null || (oVar = this.f25159p) == null) {
            return;
        }
        ArrayList<p> arrayList = oVar.f25209a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            a aVar = ((p) obj).f25213a;
            if (aVar != null && true == aVar.f25144d) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a aVar2 = ((p) it.next()).f25213a;
            if (aVar2 != null) {
                aVar2.f25144d = false;
            }
        }
        for (p pVar : arrayList) {
            a aVar3 = pVar.f25213a;
            if (Intrinsics.areEqual(str, aVar3 != null ? aVar3.f25141a : null)) {
                a aVar4 = pVar.f25213a;
                if (aVar4 != null) {
                    aVar4.f25144d = true;
                }
                oVar.f25212d = true;
                oVar.notifyDataSetChanged();
                return;
            }
        }
        qc.y.h("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.app.Activity r14, java.util.List r15, java.util.List r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.a0.h(android.app.Activity, java.util.List, java.util.List, boolean):void");
    }
}
