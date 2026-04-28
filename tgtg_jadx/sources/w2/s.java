package w2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f43036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f43037c;

    public /* synthetic */ s(Ref.IntRef intRef, Ref.IntRef intRef2, int i11) {
        this.f43035a = i11;
        this.f43036b = intRef;
        this.f43037c = intRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        switch (this.f43035a) {
            case 0:
                Ref.IntRef intRef = this.f43036b;
                if (intRef.element == -1) {
                    intRef.element = matchResult.b().f26553a;
                }
                this.f43037c.element = matchResult.b().f26554b + 1;
                break;
            default:
                Ref.IntRef intRef2 = this.f43036b;
                if (intRef2.element == -1) {
                    intRef2.element = matchResult.b().f26553a;
                }
                this.f43037c.element = matchResult.b().f26554b + 1;
                break;
        }
        return "";
    }
}
