import serial


def clean(datac):
    cleaned_data = datac[2:-5]
    return cleaned_data


def write(dataw):
    file=open("data.txt", mode='a+')
    for i in range(len(dataw)):
        file.write(dataw[i])
    file.write(' yeah!! \n')
    file.close()


arduino = serial.Serial("/dev/ttyACM0", 9600)

while True:
    data = arduino.readline()
    write(clean(str(data)))
    print(clean(str(data)))
