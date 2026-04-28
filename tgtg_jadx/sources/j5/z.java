package j5;

import i4.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f24734a = {j4.s.t(z.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), j4.s.t(z.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), j4.s.t(z.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), j4.s.t(z.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), j4.s.t(z.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), j4.s.t(z.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), j4.s.t(z.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), j4.s.t(z.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), j4.s.t(z.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), j4.s.t(z.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), j4.s.t(z.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), j4.s.t(z.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), j4.s.t(z.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), j4.s.t(z.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), j4.s.t(z.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), j4.s.t(z.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), j4.s.t(z.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), j4.s.t(z.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), j4.s.t(z.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), j4.s.t(z.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), j4.s.t(z.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), j4.s.t(z.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), j4.s.t(z.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), j4.s.t(z.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), j4.s.t(z.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), j4.s.t(z.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), j4.s.t(z.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), j4.s.t(z.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), j4.s.t(z.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), j4.s.t(z.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        a0 a0Var = x.f24707a;
        a0 a0Var2 = m.f24657a;
    }

    public static void a(b0 b0Var, Function1 function1) {
        b0Var.b(m.f24657a, new a(null, function1));
    }

    public static final void b(b0 b0Var) {
        a0 a0Var = x.f24707a;
        b0Var.b(x.f24714h, Unit.f26487a);
    }

    public static void c(b0 b0Var, Function0 function0) {
        b0Var.b(m.f24658b, new a(null, function0));
    }

    public static void d(b0 b0Var, Function1 function1) {
        b0Var.b(m.f24664h, new a(null, function1));
    }

    public static void e(b0 b0Var, int i11, Function0 function0) {
        b0Var.b(x.H, new r5.l(i11));
        b0Var.b(m.f24671p, new a(null, function0));
    }

    public static final void f(b0 b0Var, String str, Function0 function0) {
        b0Var.b(m.f24659c, new a(str, function0));
    }

    public static final void g(b0 b0Var, c4.e eVar) {
        a0 a0Var = x.f24723r;
        KProperty kProperty = f24734a[9];
        b0Var.b(a0Var, eVar);
    }

    public static final void h(String str, b0 b0Var) {
        a0 a0Var = x.f24707a;
        b0Var.b(x.f24707a, kotlin.collections.c0.c(str));
    }

    public static final void i(b0 b0Var, c4.o oVar) {
        a0 a0Var = x.f24707a;
        a0 a0Var2 = x.f24722q;
        KProperty kProperty = f24734a[8];
        b0Var.b(a0Var2, oVar);
    }

    public static final void j(b0 b0Var, c4.g gVar) {
        a0 a0Var = x.f24724s;
        KProperty kProperty = f24734a[10];
        b0Var.b(a0Var, gVar);
    }

    public static final void k(b0 b0Var, int i11) {
        a0 a0Var = x.f24716j;
        KProperty kProperty = f24734a[3];
        b0Var.b(a0Var, new g(i11));
    }

    public static final void l(String str, b0 b0Var) {
        a0 a0Var = x.f24707a;
        a0 a0Var2 = x.f24710d;
        KProperty kProperty = f24734a[2];
        b0Var.b(a0Var2, str);
    }

    public static final void m(b0 b0Var, int i11) {
        a0 a0Var = x.f24730y;
        KProperty kProperty = f24734a[14];
        b0Var.b(a0Var, new j(i11));
    }

    public static final void n(b0 b0Var, v0 v0Var) {
        a0 a0Var = x.f24707a;
        a0 a0Var2 = x.P;
        KProperty kProperty = f24734a[28];
        b0Var.b(a0Var2, v0Var);
    }

    public static final void o(String str, b0 b0Var) {
        a0 a0Var = x.f24707a;
        a0 a0Var2 = x.f24708b;
        KProperty kProperty = f24734a[0];
        b0Var.b(a0Var2, str);
    }

    public static final void p(b0 b0Var, l5.a aVar) {
        a0 a0Var = x.f24707a;
        a0 a0Var2 = x.J;
        KProperty kProperty = f24734a[25];
        b0Var.b(a0Var2, aVar);
    }

    public static final void q(b0 b0Var) {
        a0 a0Var = x.f24718m;
        KProperty kProperty = f24734a[6];
        b0Var.b(a0Var, Boolean.TRUE);
    }

    public static final void r(b0 b0Var, float f11) {
        a0 a0Var = x.f24707a;
        a0 a0Var2 = x.f24725t;
        KProperty kProperty = f24734a[11];
        b0Var.b(a0Var2, Float.valueOf(f11));
    }
}
