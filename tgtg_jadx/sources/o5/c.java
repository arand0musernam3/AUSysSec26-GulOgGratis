package o5;

import java.text.BreakIterator;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BreakIterator f31991c;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f31991c = characterInstance;
    }

    @Override // y9.w
    public final int C(int i11) {
        return this.f31991c.following(i11);
    }

    @Override // y9.w
    public final int F(int i11) {
        return this.f31991c.preceding(i11);
    }
}
