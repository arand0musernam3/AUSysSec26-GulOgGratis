package a3;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.c f247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b0 f248k;
    public CharSequence l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CharSequence f252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f254r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(CharSequence charSequence, long j9, b0 b0Var, x70.c cVar) {
        super(2, cVar);
        this.f252p = charSequence;
        this.f253q = j9;
        this.f254r = b0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        a0 a0Var = new a0(this.f252p, this.f253q, this.f254r, cVar);
        a0Var.f251o = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((TextClassifier) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        long j9;
        b0 b0Var;
        CharSequence charSequence;
        TextSelection textSelection;
        e90.c cVar;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f250n;
        if (i11 == 0) {
            ba0.g.M(obj);
            TextClassifier textClassifier = (TextClassifier) this.f251o;
            long j11 = this.f253q;
            int iG = m5.t0.g(j11);
            int iF = m5.t0.f(j11);
            CharSequence charSequence2 = this.f252p;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iG, iF);
            b0 b0Var2 = this.f254r;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(b0Var2.c());
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jB = m5.k0.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i12 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f249m = jB;
                this.f250n = 2;
                if (b0.a(b0Var2, this.f252p, jB, textClassifier, this) != aVar) {
                    j9 = jB;
                }
            } else {
                e90.c cVar2 = b0Var2.f267e;
                this.f251o = textSelectionSuggestSelection;
                this.f247j = cVar2;
                this.f248k = b0Var2;
                this.l = charSequence2;
                this.f249m = jB;
                this.f250n = 1;
                if (cVar2.g(this) != aVar) {
                    b0Var = b0Var2;
                    charSequence = charSequence2;
                    textSelection = textSelectionSuggestSelection;
                    cVar = cVar2;
                    j9 = jB;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    b0Var.f269g.setValue(new y2(charSequence, j9, textClassification));
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            j9 = this.f249m;
            charSequence = this.l;
            b0Var = this.f248k;
            cVar = this.f247j;
            textSelection = (TextSelection) this.f251o;
            ba0.g.M(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                b0Var.f269g.setValue(new y2(charSequence, j9, textClassification2));
            } finally {
                cVar.e(null);
            }
        } else {
            if (i11 != 2) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j9 = this.f249m;
            ba0.g.M(obj);
        }
        return new m5.t0(j9);
    }
}
