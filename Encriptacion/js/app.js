const btnEncrypt = document.getElementById("btn-encriptar");
const btnDecrypt = document.getElementById("btn-desencriptar");
const btnCopy=document.getElementById("btn-copiar");
const inMessage = document.getElementById("textAreas");
const textEncrypt =document.getElementById("text-encrypt")



btnEncrypt.addEventListener("click", () => {
    hideElements();
    textEncrypt.textContent=encrypt(inMessage.value);
    textEncrypt.style.visibility='visible';
});

function hideElements(){
  const elements=document.getElementsByClassName("text-decrypt");
  for (const element of elements) {
    element.style.visibility = "hidden";
  }
}

btnDecrypt.addEventListener("click", () => {
  hideElements();
  textEncrypt.textContent=decrypt(inMessage.value);
  textEncrypt.style.visibility='visible';
});

btnCopy.addEventListener("click", () => {
    navigator.clipboard.writeText(textEncrypt.textContent).then(() => {
        /* clipboard successfully set */
      }, () => {
        /* clipboard write failed */
      });
});

function encrypt(inMessage) {
  let encryptedMessage = inMessage;

  encryptedMessage = encryptedMessage.replace(/e/g, "enter");
  encryptedMessage = encryptedMessage.replace(/i/g, "imes");
  encryptedMessage = encryptedMessage.replace(/a/g, "ai");
  encryptedMessage = encryptedMessage.replace(/o/g, "ober");
  encryptedMessage = encryptedMessage.replace(/u/g, "ufat");

  return encryptedMessage;
}

function decrypt(inMessage) {
  let decryptedMessage = inMessage;

  decryptedMessage = decryptedMessage.replace(/enter/g, "e");
  decryptedMessage = decryptedMessage.replace(/imes/g, "i");
  decryptedMessage = decryptedMessage.replace(/ai/g, "a");
  decryptedMessage = decryptedMessage.replace(/ober/g, "o");
  decryptedMessage = decryptedMessage.replace(/ufat/g, "u");

  return decryptedMessage;
}
