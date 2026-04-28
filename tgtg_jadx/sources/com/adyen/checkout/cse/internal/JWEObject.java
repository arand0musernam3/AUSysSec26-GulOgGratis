package com.adyen.checkout.cse.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/cse/internal/JWEObject;", "", "header", "Lcom/adyen/checkout/cse/internal/Base64String;", "encryptedKey", "initializationVector", "cipherText", "authTag", "(Lcom/adyen/checkout/cse/internal/Base64String;Lcom/adyen/checkout/cse/internal/Base64String;Lcom/adyen/checkout/cse/internal/Base64String;Lcom/adyen/checkout/cse/internal/Base64String;Lcom/adyen/checkout/cse/internal/Base64String;)V", "getAuthTag", "()Lcom/adyen/checkout/cse/internal/Base64String;", "getCipherText", "getEncryptedKey", "getHeader", "getInitializationVector", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class JWEObject {

    @NotNull
    private final Base64String authTag;

    @NotNull
    private final Base64String cipherText;

    @NotNull
    private final Base64String encryptedKey;

    @NotNull
    private final Base64String header;

    @NotNull
    private final Base64String initializationVector;

    public JWEObject(@NotNull Base64String base64String, @NotNull Base64String base64String2, @NotNull Base64String base64String3, @NotNull Base64String base64String4, @NotNull Base64String base64String5) {
        base64String.getClass();
        base64String2.getClass();
        base64String3.getClass();
        base64String4.getClass();
        base64String5.getClass();
        this.header = base64String;
        this.encryptedKey = base64String2;
        this.initializationVector = base64String3;
        this.cipherText = base64String4;
        this.authTag = base64String5;
    }

    public static /* synthetic */ JWEObject copy$default(JWEObject jWEObject, Base64String base64String, Base64String base64String2, Base64String base64String3, Base64String base64String4, Base64String base64String5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            base64String = jWEObject.header;
        }
        if ((i11 & 2) != 0) {
            base64String2 = jWEObject.encryptedKey;
        }
        if ((i11 & 4) != 0) {
            base64String3 = jWEObject.initializationVector;
        }
        if ((i11 & 8) != 0) {
            base64String4 = jWEObject.cipherText;
        }
        if ((i11 & 16) != 0) {
            base64String5 = jWEObject.authTag;
        }
        Base64String base64String6 = base64String5;
        Base64String base64String7 = base64String3;
        return jWEObject.copy(base64String, base64String2, base64String7, base64String4, base64String6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Base64String getHeader() {
        return this.header;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Base64String getEncryptedKey() {
        return this.encryptedKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Base64String getInitializationVector() {
        return this.initializationVector;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Base64String getCipherText() {
        return this.cipherText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Base64String getAuthTag() {
        return this.authTag;
    }

    @NotNull
    public final JWEObject copy(@NotNull Base64String header, @NotNull Base64String encryptedKey, @NotNull Base64String initializationVector, @NotNull Base64String cipherText, @NotNull Base64String authTag) {
        header.getClass();
        encryptedKey.getClass();
        initializationVector.getClass();
        cipherText.getClass();
        authTag.getClass();
        return new JWEObject(header, encryptedKey, initializationVector, cipherText, authTag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JWEObject)) {
            return false;
        }
        JWEObject jWEObject = (JWEObject) other;
        return Intrinsics.areEqual(this.header, jWEObject.header) && Intrinsics.areEqual(this.encryptedKey, jWEObject.encryptedKey) && Intrinsics.areEqual(this.initializationVector, jWEObject.initializationVector) && Intrinsics.areEqual(this.cipherText, jWEObject.cipherText) && Intrinsics.areEqual(this.authTag, jWEObject.authTag);
    }

    @NotNull
    public final Base64String getAuthTag() {
        return this.authTag;
    }

    @NotNull
    public final Base64String getCipherText() {
        return this.cipherText;
    }

    @NotNull
    public final Base64String getEncryptedKey() {
        return this.encryptedKey;
    }

    @NotNull
    public final Base64String getHeader() {
        return this.header;
    }

    @NotNull
    public final Base64String getInitializationVector() {
        return this.initializationVector;
    }

    public int hashCode() {
        return this.authTag.hashCode() + ((this.cipherText.hashCode() + ((this.initializationVector.hashCode() + ((this.encryptedKey.hashCode() + (this.header.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "JWEObject(header=" + this.header + ", encryptedKey=" + this.encryptedKey + ", initializationVector=" + this.initializationVector + ", cipherText=" + this.cipherText + ", authTag=" + this.authTag + ")";
    }
}
