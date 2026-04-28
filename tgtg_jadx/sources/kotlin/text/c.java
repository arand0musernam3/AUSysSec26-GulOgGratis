package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f26594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f26596c;

    public c(CharSequence charSequence, int i11, Function2 function2) {
        charSequence.getClass();
        this.f26594a = charSequence;
        this.f26595b = i11;
        this.f26596c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
