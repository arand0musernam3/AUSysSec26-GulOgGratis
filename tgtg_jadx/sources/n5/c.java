package n5;

import java.text.CharacterIterator;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f30508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30510c = 0;

    public c(int i11, CharSequence charSequence) {
        this.f30508a = charSequence;
        this.f30509b = i11;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i11 = this.f30510c;
        return i11 == this.f30509b ? CharCompanionObject.MAX_VALUE : this.f30508a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f30510c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f30509b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f30510c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i11 = this.f30509b;
        if (i11 == 0) {
            this.f30510c = i11;
            return CharCompanionObject.MAX_VALUE;
        }
        int i12 = i11 - 1;
        this.f30510c = i12;
        return this.f30508a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i11 = this.f30510c + 1;
        this.f30510c = i11;
        int i12 = this.f30509b;
        if (i11 < i12) {
            return this.f30508a.charAt(i11);
        }
        this.f30510c = i12;
        return CharCompanionObject.MAX_VALUE;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i11 = this.f30510c;
        if (i11 <= 0) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i12 = i11 - 1;
        this.f30510c = i12;
        return this.f30508a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i11) {
        if (i11 > this.f30509b || i11 < 0) {
            i4.a.f("invalid position");
            return (char) 0;
        }
        this.f30510c = i11;
        return current();
    }
}
