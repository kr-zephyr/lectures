FROM python:3.4-alpine
ADD /code /code
WORKDIR /code
#CMD ["ls", "-al"]
RUN pip install -r requirements.txt
CMD ["python","app.py"]