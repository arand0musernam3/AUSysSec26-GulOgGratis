package zendesk.okhttp;

import androidx.lifecycle.n1;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import q90.g0;
import q90.p0;
import q90.w;
import q90.x;
import v80.f0;
import v90.g;
import x70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R>\u0010\b\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzendesk/okhttp/HeaderInterceptor;", "Lq90/x;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lx70/c;", "", "headers", "<init>", "(Ljava/util/Set;)V", "headerValue", "normalizeHeaderValue", "(Ljava/lang/String;)Ljava/lang/String;", "Lq90/w;", "chain", "Lq90/p0;", "intercept", "(Lq90/w;)Lq90/p0;", "Ljava/util/Set;", "zendesk.okhttp_okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderInterceptor.kt\nzendesk/okhttp/HeaderInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class HeaderInterceptor implements x {

    @NotNull
    private final Set<Pair<String, Function1<c<? super String>, Object>>> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderInterceptor(@NotNull Set<? extends Pair<String, ? extends Function1<? super c<? super String>, ? extends Object>>> set) {
        set.getClass();
        this.headers = set;
    }

    private final String normalizeHeaderValue(String headerValue) {
        String strNormalize = Normalizer.normalize(headerValue, Normalizer.Form.NFD);
        strNormalize.getClass();
        return new Regex("[^\\p{ASCII}]").replace(strNormalize, "");
    }

    @Override // q90.x
    @NotNull
    public p0 intercept(@NotNull w chain) throws IOException {
        chain.getClass();
        g gVar = (g) chain;
        n1 n1VarB = gVar.f42190e.b();
        for (Pair<String, Function1<c<? super String>, Object>> pair : this.headers) {
            String str = (String) pair.f26485a;
            String str2 = (String) f0.E(kotlin.coroutines.g.f26549a, new HeaderInterceptor$intercept$headerValue$1((Function1) pair.f26486b, null));
            if (str2 != null) {
                String str3 = StringsKt.H(str2) ? null : str2;
                if (str3 != null) {
                    n1VarB.e(str, normalizeHeaderValue(str3));
                }
            }
        }
        return gVar.b(new g0(n1VarB));
    }
}
